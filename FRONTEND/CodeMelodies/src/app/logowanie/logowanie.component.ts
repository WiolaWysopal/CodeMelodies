import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-logowanie',
  templateUrl: './logowanie.component.html',
  styleUrls: ['./logowanie.component.css']
})
export class LogowanieComponent implements OnInit{

  username: string = '';
  password: string = '';
  loginButtonStyle = {};

  constructor(private http: HttpClient, private router: Router, private authService: AuthService) {}

  login() {
    const encodedCredentials = window.btoa(this.username + ':' + this.password);
    localStorage.setItem('auth', encodedCredentials);
    const headers = new HttpHeaders({
      'Authorization': 'Basic ' + encodedCredentials
    });

    this.http.get('http://localhost:8080/api/login/zaloguj', { headers: headers, responseType: 'text' })
      .subscribe(
        data => {
          console.log('Login successful', data);
          this.router.navigate(['/']);
        },
        error => {
          console.error('Login failed', error);
          localStorage.removeItem('auth');
          this.loginButtonStyle = { 'background-color': '#f11'};
          setTimeout(() => this.loginButtonStyle = {'background-color': '#888'}, 1000); // Reset style after 1 second
    
        }
      );
  }

  ngOnInit(): void {
    if(this.authService.isLoggedIn()){
      this.router.navigate(['/']);
    }
  }

  islogged(){
    return this.authService.isLoggedIn();
  }

}
