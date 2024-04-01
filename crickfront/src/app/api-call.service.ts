import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ApiCallService {
  constructor(private _httpClient: HttpClient) {}

  getAllMatches() {
    return this._httpClient.get('http://localhost:8080/match/getAll');
  }

  getLiveMatches() {
    return this._httpClient.get('http://localhost:8080/match/live');
  }

  getPointTable() {
    return this._httpClient.get('http://localhost:8080/match/point-table');
  }
}
