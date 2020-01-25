import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { mediaInfo } from '../model/med';

@Component({
  selector: 'media-base3',
  templateUrl: './media-base3.component.html',
  styleUrls: ['./media-base3.component.css']
})
export class MediaBase3Component implements OnInit {
  @Output()
  submit_info : EventEmitter<mediaInfo>;

  constructor() { 
    // initialize event object
    this.submit_info = new EventEmitter();
  }
  saveChanges(name:HTMLInputElement,des:HTMLInputElement,tag:HTMLInputElement,fn:HTMLInputElement):void{
    let m1=new mediaInfo(name.value,des.value,tag.value,fn.value);

    this.submit_info.emit(m1);
    
    name.value = "";
    des.value = "";
    tag.value = "";
    fn.value = "";
  }
  
  ngOnInit() {
  }

}
