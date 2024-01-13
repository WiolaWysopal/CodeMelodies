import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { YouTubeComponent } from './you-tube/you-tube.component';
import { ZdjeciaComponent } from './zdjecia/zdjecia.component';
import { KontaktComponent } from './kontakt/kontakt.component';
import { PublikacjeComponent } from './publikacje/publikacje.component';
import { SafeUrlPipe } from 'src/SafeUrlPipe';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent, 
    NavbarComponent, 
    YouTubeComponent,
    ZdjeciaComponent,
    KontaktComponent,
    PublikacjeComponent,
    SafeUrlPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
