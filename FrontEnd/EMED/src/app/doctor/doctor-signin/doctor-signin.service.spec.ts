import { TestBed } from '@angular/core/testing';

import { DoctorSigninService } from './doctor-signin.service';

describe('DoctorSigninService', () => {
  let service: DoctorSigninService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DoctorSigninService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
