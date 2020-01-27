Rails.application.routes.draw do
  get 'index', to: 'welcome#index'
 

  root 'welcome#login'
end