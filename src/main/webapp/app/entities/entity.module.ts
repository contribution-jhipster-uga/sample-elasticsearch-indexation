import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {path: 'photo',loadChildren: () => import('./photo-photo/photo-photo.module').then(m => m.LazyblobPhotoPhotoModule)},
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class TestModuleEntityModule {}
