import { Component, OnInit } from '@angular/core';
import { mediaInfo } from '../model/med';

@Component({
  selector: 'media-base',
  templateUrl: './media-base.component.html',
  styleUrls: ['./media-base.component.css']
})
export class MediaBaseComponent{
  mediaInformation:Array<mediaInfo>;
   constructor(){
     this.mediaInformation=[new mediaInfo("video","new video","@first","one"),
                            new mediaInfo("video","new video","@second","two"),
                            new mediaInfo("video","new video","@third","three"), 
     ];
   }
   
      

   addNewmediaInfo(m1:mediaInfo):void{
    // add new product received from other component 
    this.mediaInformation.push(m1);
  }
 
   }

 


