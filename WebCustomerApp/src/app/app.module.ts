import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { TopNavbarComponent } from './top-navbar/top-navbar.component';
import { SideNavbarComponent } from './side-navbar/side-navbar.component';
import { CustomerPageComponent } from './customer-page/customer-page.component';
import { GetAllCustomersComponent } from './get-all-customers/get-all-customers.component';
import { GetSpecificCustomerComponent } from './get-specific-customer/get-specific-customer.component';
import { DeleteCustomerComponent } from './delete-customer/delete-customer.component';
import { CreateDependentComponent } from './create-dependent/create-dependent.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { GetDependentsComponent } from './get-dependents/get-dependents.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    TopNavbarComponent,
    SideNavbarComponent,
    CustomerPageComponent,
    GetAllCustomersComponent,
    GetSpecificCustomerComponent,
    DeleteCustomerComponent,
    CreateDependentComponent,
    CreateCustomerComponent,
    GetDependentsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
