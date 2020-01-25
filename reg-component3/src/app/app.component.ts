import { Component } from '@angular/core';
import { mediaInfo } from './model/med';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  mediaInformation:Array<mediaInfo>
}
