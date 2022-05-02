import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { ConfigService } from '../config/config.service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  error = '';

  constructor(private configService: ConfigService, private router: Router) {
  }

  onClickSubmit(data: any) {
    this.configService.login(data).subscribe(data => {
      this.router.navigate(['/home']);
      console.log(data);
    }, (err) => {
      console.log(err);
      this.error = err.error;
      console.log(err.error);
    });
  }
}
