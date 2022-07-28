import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { EditEducationComponent } from './components/education/edit-education.component';
import { NewEducationComponent } from './components/education/new-education.component';
import { EducationComponent } from './components/education/education.component';


import { ExperienceComponent} from './components/experience/experience.component';
import { EditExperiencieComponent } from './components/experience/edit-experiencie.component';
import { NewExperienceComponent } from './components/experience/new-experience.component';

import { AboutMeComponent} from './components/about-me/about-me.component';
//import { EditAboutMeComponent } from './components/about-me/edit-about-me.component';
//import { NewAboutMeComponent } from './components/about-me/new-about-me.component';

import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'login', component: LoginComponent},

  { path: 'exp', component: ExperienceComponent },
  { path: 'nuevaexp', component: NewExperienceComponent },
  { path: 'editexp/:id', component: EditExperiencieComponent },

  { path: 'edu', component: EducationComponent},
  { path: 'nuevaedu', component: NewEducationComponent},
  { path: 'editedu/:id', component: EditEducationComponent},
  
  { path: 'sobremi', component: AboutMeComponent},
  //{ path: 'nuevasobremi', component: NewAboutMeComponent},
  //{ path: 'editsobremi/:id', component: EditAboutMeComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
