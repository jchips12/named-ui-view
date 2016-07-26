//This is for studying multiple ui views, real world application,
//I'm following https://github.com/johnpapa/angular-styleguide/tree/master/a1
//best pratices
(function(){
    'use strict';
    
    //app
    angular.module('app.controllers', []);
    angular.module('app.services', []);
    angular.module('app', ['ui.router', 'app.controllers', 'app.services']);
    
    //run
    angular.module('app').run(runBlock);
    runBlock.$inject = ['$rootScope'];
    function runBlock($rootScope){
        
    }
    
    //config
    angular.module('app').config(config);
    config.$inject = ['$stateProvider', '$urlRouterProvider', '$httpProvider'];
    function config($stateProvider, $urlRouterProvider, $httpProvider) {
        $urlRouterProvider.otherwise('/');
        $stateProvider.state('app', {
            url : '/',
            views : {
                header : {
                    templateUrl : '/html/header.html'
                },
                left : {
                    templateUrl : '/html/left.html'
                },
                right : {
                    templateUrl : '/html/right.html'
                },
                footer : {
                    templateUrl : '/html/footer.html'
                }
            }
        });
        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
    }
    
    //controllers
    
    //services
    
    //components
    
})();