import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetAllCustomersComponent } from './get-all-customers/get-all-customers.component';

const routes: Routes = [
  {path: "viewcustomer", component:GetAllCustomersComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
