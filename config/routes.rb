Rails.application.routes.draw do
  get 'welcome/index'
 
  root 'welcome#login'
end