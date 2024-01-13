import { Component,OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface Video {
  id: string;
  title: string;
  url: string;
  defaultWidth: number;
  defaultHeight: number;
}

@Component({
  selector: 'app-you-tube',
  templateUrl: './you-tube.component.html',
  styleUrls: ['./you-tube.component.css']
})
export class YouTubeComponent {
  videos: Video[] = [];
  private apiUrl = 'http://localhost:8080/api/youtube';

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get<Video[]>(this.apiUrl).subscribe(
      data => {
        this.videos = data;
      },
      error => console.error('Error fetching data:', error)
    );
  }

}
