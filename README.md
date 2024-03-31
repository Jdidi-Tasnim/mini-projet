# mini-projet
GRPC 
1-configurer correctement pom.xml avec les dépendances nécessaires pour gRPC et le plugin Maven pour la génération de code à partir du fichier .proto
2-Génération de code à partir du fichier .proto: Utilisez la commande Maven pour générer le code Java à partir du fichier .proto
maven build
3-Implémentation du serveur et du client gRPC en utilisant les classes générés à partir du fichier .proto
4-Commpilation de projet :
Compilez votre projet Maven pour vous assurer que toutes les dépendances sont correctement téléchargées et que le code est correctement généré.
(J'ai fait update pour mon projet (maven update puis run as Mavne build)
5-Exécution du serveur: Lancez votre serveur en exécutant la classe principale du serveur.
6-Exécution du client: Lancez votre client en exécutant la classe principale du client.
Test d'application:Une fois que le serveur et le client sont en cours d'exécution, testez votre application en envoyant des messages, en récupérant des messages
Java Rmi:
Déploiement :
Implémenter les interfaces distantes : Créez les interfaces distantes décrivant les méthodes que votre serveur RMI exposera.

Implémenter le serveur RMI : Implémentez le serveur RMI en créant une classe qui étend UnicastRemoteObject et implémente l'interface distante.

Implémenter le client RMI : Implémentez le client RMI en utilisant la classe Naming pour rechercher l'objet distant sur le registre RMI.

Compiler les classes : Compilez toutes les classes du serveur et du client.

Générer les fichiers de stub et de skeleton : Utilisez rmic pour générer les fichiers de stub et de skeleton nécessaires pour la communication RMI.
Test:
Démarrer rmiRegister rmiregistry (dans le terminal)
 (ou bien a travers le code )
 Démarrer le serveur : Lancez votre serveur RMI en exécutant la classe principale du serveur.
 Exécuter le client : Lancez votre client RMI en exécutant la classe principale du client.
 Tester l'application : Une fois que le serveur et le client sont en cours d'exécution, testez votre application en ajoutant des tâches, en récupérant des tâches, etc.


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
