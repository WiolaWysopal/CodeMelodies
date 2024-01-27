import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  biogramData: string = ''; // Property to store the fetched data
  imageData: string = '';

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.loadData();
  }

  private loadData() {
    this.http.get('http://localhost:8080/api/about', { responseType: 'text' })
    .subscribe(
      data => this.biogramData = data,
      error => console.error(error)
    );
    this.http.get('http://localhost:8080/api/photo/ba5ae4f1-377d-4721-b690-a6edeba36449', { responseType: 'blob' })
    .subscribe(
      data => {
        const reader = new FileReader();
        reader.onload = () => {
            this.imageData = reader.result as string;
        };
        reader.readAsDataURL(data);
    },
    error => console.error(error)
    );
  }
}
