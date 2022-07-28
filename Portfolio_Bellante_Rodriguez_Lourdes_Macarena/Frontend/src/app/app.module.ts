import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { NavComponent } from './components/nav/nav.component';
import { BannerComponent } from './components/banner/banner.component';

import { EducationComponent } from './components/education/education.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HandsComponent } from './components/hands/hands.component';
import { ProyectsComponent } from './components/proyects/proyects.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms'
import { interceptorProvider } from './service/interceptor-service';

import { NewExperienceComponent } from './components/experience/new-experience.component';
import { EditExperiencieComponent } from './components/experience/edit-experiencie.component';

import { NewEducationComponent } from './components/education/new-education.component';
import { EditEducationComponent } from './components/education/edit-education.component';

import {AboutMeComponent } from './components/about-me/about-me.component';
//import { NewAboutMeComponent } from './components/about-me/new-about-me.component';
//import { EditAboutMeComponent } from './components/about-me/edit-about-me.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    NavComponent,
    BannerComponent,

    EducationComponent,
    ExperienceComponent,
    HandsComponent,
    ProyectsComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,

    NewExperienceComponent,
    EditExperiencieComponent,

    NewEducationComponent,
    EditEducationComponent,
    
    AboutMeComponent,
    //NewAboutMeComponent,
    //EditAboutMeComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
    FormsModule, 
    ReactiveFormsModule
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
