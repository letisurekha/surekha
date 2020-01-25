import { Component, OnInit, Input } from '@angular/core';
import { mediaInfo } from '../model/med';

@Component({
  selector: 'media-base2',
  templateUrl: './media-base2.component.html',
  styleUrls: ['./media-base2.component.css']
})
export class MediaBase2Component implements OnInit {
  @Input()
  mediaInfor:Array<mediaInfo>;
  constructor() { }

  ngOnInit() {
  }

}
