import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { YouTubeComponent } from './youtube/youtube.component';
import { LogowanieComponent } from './logowanie/logowanie.component';
import { RejestracjaComponent } from './rejestracja/rejestracja.component';

const routes: Routes = [
  {path: '', component: HomeComponent, pathMatch: 'full'},
  {path: 'yt', component: YouTubeComponent, pathMatch: 'full'},
  {path: 'login', component: LogowanieComponent, pathMatch: 'full'},
  {path: 'rejestracja', component: RejestracjaComponent, pathMatch: 'full'},
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
