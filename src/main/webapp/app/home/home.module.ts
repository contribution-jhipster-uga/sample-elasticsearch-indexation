import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { TestModuleSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [TestModuleSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent]
})
export class TestModuleHomeModule {}
