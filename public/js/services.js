var todosService = angular.module('todosService', ['ngResource']);

todosService.factory('Todo', ['$resource',
    function ($resource) {
        return $resource(jsRoutes.controllers.TodosAjaxController.getTodos().url, {}, {
            query: {method: 'GET', params: {}, isArray: true}
        });
    }]);