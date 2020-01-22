import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { EntityComponent } from './entity/entity.component';
import { HeaderComponent } from './header/header.component';
import { SectionComponent } from './section/section.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    EntityComponent,
    HeaderComponent,
    SectionComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
