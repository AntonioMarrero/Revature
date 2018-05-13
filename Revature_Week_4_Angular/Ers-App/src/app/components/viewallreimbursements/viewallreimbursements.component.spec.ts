import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewallreimbursementsComponent } from './viewallreimbursements.component';

describe('ViewallreimbursementsComponent', () => {
  let component: ViewallreimbursementsComponent;
  let fixture: ComponentFixture<ViewallreimbursementsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewallreimbursementsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewallreimbursementsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
