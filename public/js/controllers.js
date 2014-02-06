var todosController = angular.module('todosController', []);

todosController.controller('TodoListCtrl', ['$scope', 'Todo', function ($scope, Todo) {
    $scope.todos = Todo.query();
}]);