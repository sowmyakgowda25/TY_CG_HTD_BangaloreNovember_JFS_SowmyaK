import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';
import { Injectable} from '@angular/core';

@Injectable({
    providedIn: 'root'
})
 export class AuthGuard implements CanActivate {
    canActivate(route: ActivatedRouteSnapshot): boolean {
       const expectedTypesArray = route.data.expectedTypes;
       const userDetails = JSON.parse(localStorage.getItem('details'));
       let expectedType: string;
       for (const index in expectedTypesArray) {
           if (userDetails && userDetails.type === expectedTypesArray[index]) {
               expectedType = expectedTypesArray[index];
           }
       }
       if (userDetails && userDetails.type === expectedType) {
           return true;
       } else {
           return false;
       }
    }
 }
