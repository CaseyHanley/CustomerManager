import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetSpecificCustomerComponent } from './get-specific-customer.component';

describe('GetSpecificCustomerComponent', () => {
  let component: GetSpecificCustomerComponent;
  let fixture: ComponentFixture<GetSpecificCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetSpecificCustomerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GetSpecificCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
