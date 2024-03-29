# mini-projet
GRPC 
Définition des services et des messages (Protobuf):

La communication entre le client et le serveur utilise gRPC, qui s'appuie sur des définitions de services et de messages dans un fichier .proto.
Le fichier .proto définit le service MessagingService avec deux méthodes RPC : SendMessage et GetMessagesForUser.
Il définit aussi les messages utilisés par ces méthodes : MessageRequest, UserRequest, MessageResponse et MessagesResponse.
Génération de code:

Le plugin gRPC génère des classes Java à partir du fichier .proto.
Ces classes permettent aux clients et serveurs de communiquer en utilisant les messages et services définis dans le fichier .proto.
Implémentation du serveur:

La classe MessagingServer implémente le serveur gRPC avec la bibliothèque gRPC Java.
Le serveur écoute sur le port 9000 (modifiable) et une implémentation du service MessagingService est ajoutée.
Les méthodes RPC du service MessagingService sont implémentées dans la classe MessagingServiceImpl.
La logique métier pour traiter les requêtes et renvoyer les réponses est implémentée dans ces méthodes.
Implémentation du client:

La classe MessagingClient crée un client gRPC qui se connecte au serveur avec l'adresse IP et le port du serveur.
Le stub généré est utilisé pour invoquer les méthodes RPC du serveur (sendMessage et getMessagesForUser).
Des instances des messages MessageRequest et UserRequest sont créées et passées en paramètres aux méthodes RPC.
Les réponses du serveur sont ensuite traitées.
Exécution du serveur et du client:

Le serveur MessagingServer est démarré en premier pour écouter les requêtes sur le port spécifié.
Le client MessagingClient est ensuite exécuté pour se connecter au serveur et envoyer des requêtes RPC pour interagir avec le service de messagerie.
En résumé:

Le fichier .proto définit les services et messages utilisés pour la communication.
Le plugin gRPC génère des classes Java à partir du fichier .proto.
Le serveur gRPC est implémenté avec la bibliothèque gRPC Java et écoute sur un port.
Le client gRPC se connecte au serveur et utilise les stubs générés pour invoquer les méthodes RPC.
Les messages définis dans le fichier .proto sont utilisés pour échanger des données entre le client et le serveur.
