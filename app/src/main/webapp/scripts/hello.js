angular.module('resultApp', [])
.controller('resultcontroller', function($scope, $http) {
	debugger;
	$scope.hello = function(){
	$http.post('./ledgerquery/query'). 
        then(function(response) {
            $scope.result = response.data;
        });
	}
});