import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetDependentsComponent } from './get-dependents.component';

describe('GetDependentsComponent', () => {
  let component: GetDependentsComponent;
  let fixture: ComponentFixture<GetDependentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetDependentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GetDependentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
