
## Deploy

gcloud container clusters list

gcloud container clusters get-credentials my-cluster --zone us-central1-a --project ultimate-hydra-288114

kubectl apply -f deployment-mongo.yaml

kubectl get pods

docker build --tag customer-app-gcloud:1.0 .

docker tag customer-app-gcloud:1.0 gcr.io/ultimate-hydra-288114/customer-app-gcloud:1.0

docker images --format "table {{.Repository}}\t{{.ID}}"

gcloud docker -- push gcr.io/ultimate-hydra-288114/customer-app-gcloud:1.0

kubectl apply -f deployment-customer-service.yml

kubectl apply -f gcloud-spring-boot-ingress.yaml

gcloud container clusters delete spring-boot --zone us-central1-c