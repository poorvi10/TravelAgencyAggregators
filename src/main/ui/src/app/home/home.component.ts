import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {FormGroup, FormControl} from '@angular/forms';

import { ConfigService } from '../config/config.service';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  range = new FormGroup({
    start: new FormControl(),
    end: new FormControl(),
  });

  location = new FormGroup({
    city: new FormControl()
  });

  error: any;
  carList: any;

  constructor(private configService: ConfigService, private router: Router) {
  }

  filterCars() {
    const data = {
      'startDate': this.range.controls['start'].value,
      'endDate': this.range.controls['end'].value,
      'location': this.location.controls['city'].value
    }

    this.location.controls['city'].value

    this.configService.search(data).subscribe((data: any) => {
      // this.router.navigate(['/search']);
      this.carList = data.cars;
      console.log(data);
    }, (err: any) => {
      console.log(err);
      this.error = err.error;
      console.log(err.error);
    });
  }

  book(car: any) {
    console.log(car);
    this.router.navigate(['/booking'], {
      queryParams:
        {
          agencyName: car.agencyName,
          baseFare: car.baseFare,
          carCompany: car.carCompany,
          carName: car.carName,
          location: car.location,
          carModel: car.carModel,

        }
    });
  }
}
