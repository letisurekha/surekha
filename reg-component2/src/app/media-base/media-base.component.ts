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
   saveChanges(name:HTMLInputElement,des:HTMLInputElement,tag:HTMLInputElement,fn:HTMLInputElement):void{
        let m1=new mediaInfo(name.value,des.value,tag.value,fn.value);
        this.mediaInformation.push(m1);
        
        name.value = "";
        des.value = "";
        tag.value = "";
        fn.value = "";
      

   }
 
   }

 


