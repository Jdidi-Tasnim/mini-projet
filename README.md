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
Socket:
Déploiement du serveur :
Compilez le fichier ChatServer.java pour générer le fichier ChatServer.class
javac ChatServer.java
Exécutez le fichier ChatServer.class pour démarrer le serveur.
java ChatServer
Déploiement du client :
Compilez le fichier ChatClient.java pour générer le fichier ChatClient.class.
javac ChatClient.java
Exécutez le fichier ChatClient.class pour démarrer un client.
java ChatClient
Test de l'application :
Une fois que le serveur et le client sont en cours d'exécution, le serveur affichera "Server started. Waiting for clients..." et attendra les connexions des clients.

Exécutez plusieurs instances du client pour simuler plusieurs utilisateurs se connectant au serveur. Vous pouvez exécuter plusieurs instances du client dans différents terminaux ou dans des fenêtres de console distinctes.

Une fois que les clients sont connectés, ils peuvent commencer à échanger des messages. Chaque fois qu'un client envoie un message, il sera diffusé à tous les autres clients connectés.

Vous pouvez saisir des messages dans la console du client pour les envoyer au serveur. Le serveur recevra ces messages et les diffusera à tous les autres clients, qui les afficheront dans leur console.

Vous pouvez tester différents scénarios, tels que l'envoi de messages de plusieurs clients simultanément, la déconnexion et la reconnexion des clients, etc., pour vous assurer que l'application fonctionne correctement dans diverses situations.
