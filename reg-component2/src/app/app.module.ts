import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaBaseComponent } from './media-base/media-base.component';
import { MediaBase2Component } from './media-base2/media-base2.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaBaseComponent,
    MediaBase2Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
