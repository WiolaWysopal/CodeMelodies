import { Component,OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-zdjecia',
  templateUrl: './zdjecia.component.html',
  styleUrls: ['./zdjecia.component.css']
})
export class ZdjeciaComponent {
  zdjecia: any[] = [];
  private apiUrl = 'http://localhost:8080/api/photos/ids';
  private photoBaseUrl = 'http://localhost:8080/api/photo/';

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchZdjecia();
  }

  fetchZdjecia() {
    this.http.get<any[]>(this.apiUrl).subscribe(
      data => data.forEach(id => this.fetchPhoto(id)),
      err => console.error(err)
    );
  }

  fetchPhoto(id: string) {
    const photoUrl = this.photoBaseUrl + id;
    this.http.get(photoUrl, { responseType: 'blob' }).subscribe(
      blob => {
        const objectURL = URL.createObjectURL(blob);
        this.zdjecia.push({ id: id, url: objectURL });
      },
      err => console.error(err)
    );
  }
}
