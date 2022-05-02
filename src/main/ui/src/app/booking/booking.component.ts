import { Component } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

import { ConfigService } from '../config/config.service';

@Component({
  selector: 'booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.scss']
})
export class BookingComponent {

  error = '';
  confirmation = true;

  bookingDetails: any;

  constructor(private configService: ConfigService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.bookingDetails = this.activatedRoute.snapshot.queryParams;
  }

  book(data: any) {
    this.confirmation = false;
     console.log(data);
  }
}
