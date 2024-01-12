import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  fetchedData: string = ''; // Property to store the fetched data

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.loadData();
  }

  private loadData() {
    this.http.get('http://localhost:8080/api/omnie', { responseType: 'text' })
    .subscribe(
      data => this.fetchedData = data,
      error => console.error(error)
    );
  }
}
