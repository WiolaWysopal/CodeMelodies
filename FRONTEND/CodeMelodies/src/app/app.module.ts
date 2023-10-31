import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PasekComponent } from './pasek/pasek.component';
import { TloComponent } from './tlo/tlo.component';

@NgModule({
  declarations: [
    AppComponent,
    PasekComponent,
    TloComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
