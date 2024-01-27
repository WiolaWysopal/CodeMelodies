import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

interface Tag {
  name: string;
  color: string;
}
interface Event {
  id: string;
  nazwa: string;
  dataRozpoczecia: string;
  lokalizacja: string;
  tagi: Tag[];
} 

interface SocialMedia {
  mediumName: string;
  profileURL: string;
  iconId: string;
  iconUrl?: string;
}

@Component({
  selector: 'app-kontakt',
  templateUrl: './kontakt.component.html',
  styleUrls: ['./kontakt.component.css']
})
export class KontaktComponent {
  events: Event[] = [];
  private apiWydarzeniaUrl = 'http://localhost:8080/api/events';
  socialMediaLinks: SocialMedia[] = [];
  private apiSocialMediaUrl = 'http://localhost:8080/api/socialmedia';
  private iconBaseUrl = 'http://localhost:8080/api/icon/';


  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get<Event[]>(this.apiWydarzeniaUrl).subscribe(
      data => this.events = data,
      err => console.error(err)
    );
    this.fetchSocialMediaLinks();
  }

  fetchSocialMediaLinks() {
    this.http.get<SocialMedia[]>(this.apiSocialMediaUrl).subscribe(
      links => {
        this.socialMediaLinks = links;
        links.forEach(link => this.fetchIcon(link));
      },
      err => console.error(err)
    );
  }

  fetchIcon(link: SocialMedia) {
    this.http.get(this.iconBaseUrl + link.iconId, { responseType: 'blob' }).subscribe(
      blob => {
        const objectURL = URL.createObjectURL(blob);
        link.iconUrl = objectURL;
      },
      err => console.error(err)
    );
  }
}
