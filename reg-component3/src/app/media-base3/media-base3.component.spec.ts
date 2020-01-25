import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MediaBase3Component } from './media-base3.component';

describe('MediaBase3Component', () => {
  let component: MediaBase3Component;
  let fixture: ComponentFixture<MediaBase3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MediaBase3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MediaBase3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
