cd createjar
sh packager.sh
sh makerelease.sh
cd ../
cp createjar/release.zip build/Chancecoin-2.2.zip
mkdir chancecoin.com
mkdir chancecoin.com/downloads
cp build/* chancecoin.com/downloads

#to do a release:
# 1. Change the version number in the Config.java file.
# 2. Change download.txt and min_version.txt
# 3. Change the version number on line 5 above.
# 4. Run sh generate_package.sh
# 5. scp -r chancecoin.com root@chancecoin.com:/var/www/
# 6. git commit -am "update"; git push
# 7. Log in to chancecoin.com and cd /var/www/chancecoin.com/chancecoinj; git pull; killall -9 java; nohup sh start_server.sh &
