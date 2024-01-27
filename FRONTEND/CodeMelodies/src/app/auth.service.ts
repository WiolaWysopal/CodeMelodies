import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class AuthService {

  constructor(private http: HttpClient) { }

  public getAuthToken() {
    return localStorage.getItem('auth');
  }

  public isLoggedIn(): boolean {
    return !!this.getAuthToken();
  }

  public logout() {
    this.http.post('http://localhost:8080/api/logout', {}).subscribe({
      next: (response) => {
        // Handle response
        console.log('Logged out successfully', response);
      },
      error: (error) => {
        // Handle error
        console.error('Error logging out', error);
      }
    });
    localStorage.removeItem('auth');
  }
}