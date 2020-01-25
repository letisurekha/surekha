import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MediaBase2Component } from './media-base2.component';

describe('MediaBase2Component', () => {
  let component: MediaBase2Component;
  let fixture: ComponentFixture<MediaBase2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MediaBase2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MediaBase2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
