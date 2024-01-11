import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { YouTubeComponent } from './you-tube/you-tube.component';
import { PublikacjeComponent } from './publikacje/publikacje.component';
import { ZdjeciaComponent } from './zdjecia/zdjecia.component';
import { KontaktComponent } from './kontakt/kontakt.component';

const routes: Routes = [
  {path: '', component: HomeComponent, pathMatch: 'full'},
  {path: 'home', component: HomeComponent, pathMatch: 'full'},
  {path: 'youtube', component: YouTubeComponent, pathMatch: 'full'},
  {path: 'publikacje', component: PublikacjeComponent, pathMatch: 'full'},
  {path: 'zdjecia', component: ZdjeciaComponent, pathMatch: 'full'},
  {path: 'kontakt', component: KontaktComponent, pathMatch: 'full'}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
