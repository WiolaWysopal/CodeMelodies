import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { PasekComponent } from './pasek/pasek.component';
import { TloComponent } from './tlo/tlo.component';
import { LoginComponent } from './login/login.component';
import { LoginErrorComponent } from './login-error/login-error.component';
import { RegisterComponent } from './register/register.component';
import { YouTubenapisComponent } from './youtubenapis/you-tubenapis.component';
import { YouTubeComponent } from './youtube/youtube.component';
import { FormsModule } from '@angular/forms';
import { LogowanieComponent } from './logowanie/logowanie.component';
import { RejestracjaComponent } from './rejestracja/rejestracja.component';


@NgModule({
  declarations: [
    AppComponent,
    PasekComponent,
    TloComponent,
    LoginComponent,
    LoginErrorComponent,
    RegisterComponent,
    YouTubenapisComponent,
    HomeComponent, 
    YouTubeComponent, LogowanieComponent, RejestracjaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
