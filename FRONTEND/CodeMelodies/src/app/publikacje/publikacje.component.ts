import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-publikacje',
  templateUrl: './publikacje.component.html',
  styleUrls: ['./publikacje.component.css']
})
export class PublikacjeComponent {
  publications: any[] = [];
  private apiUrl = 'http://localhost:8080/api/publications';

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchPublications();
  }

  fetchPublications() {
    this.http.get<any[]>(this.apiUrl).subscribe(
      data => this.publications = data,
      err => console.error(err)
    );
  }

  downloadFile(fileId: string) {
    this.http.get(`http://localhost:8080/api/publication/${fileId}`, { responseType: 'blob' }).subscribe(
      blob => {
        // Handle the blob file (e.g., download or preview)
        const url = window.URL.createObjectURL(blob);
        window.open(url); // Or download it
      },
      err => console.error(err)
    );
  }
}
