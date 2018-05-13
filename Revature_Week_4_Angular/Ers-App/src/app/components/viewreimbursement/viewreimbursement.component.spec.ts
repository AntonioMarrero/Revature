import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewreimbursementComponent } from './viewreimbursement.component';

describe('ViewreimbursementComponent', () => {
  let component: ViewreimbursementComponent;
  let fixture: ComponentFixture<ViewreimbursementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewreimbursementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewreimbursementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
