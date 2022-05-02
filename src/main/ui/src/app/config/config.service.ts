import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable()
export class ConfigService {
  constructor(private http: HttpClient) {}



  login(data: any): Observable<any> {
    return  this.http.post<any>('http://localhost:8080/customer/check', { uname: data.email, password: data.password });
  }

  search(data: any): Observable<any> {
    return  this.http.post<any>('http://localhost:8080/car/search', { startDate: data.startDate, endDate: data.endDate, location: data.location });
  }
}
