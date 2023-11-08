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
import { YouTubenapisComponent } from './you-tubenapis/you-tubenapis.component';


@NgModule({
  declarations: [
    AppComponent,
    PasekComponent,
    TloComponent,
    LoginComponent,
    LoginErrorComponent,
    RegisterComponent,
    YouTubenapisComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
