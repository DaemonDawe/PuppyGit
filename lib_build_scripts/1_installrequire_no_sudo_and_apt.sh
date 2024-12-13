#!/bin/bash

#echo "Updating package list..."
#sudo apt update
#
#echo "Installing: curl cmake make tar libssl-dev maven unzip"
#sudo apt install -y curl cmake make tar libssl-dev maven unzip



export build_root=~/puppylibsbuild
mkdir -p $build_root
cd $build_root

export ndk_filename="android-ndk-r26d-linux"
echo "Downloading: ndk"
curl -L -o "${build_root}/$ndk_filename.zip" "https://dl.google.com/android/repository/${ndk_filename}.zip"
export ANDROID_NDK_ROOT=$build_root/android-ndk
mkdir -p $ANDROID_NDK_ROOT
echo "Extracting: ndk"
# -q : only show msg when err
unzip -q "$ndk_filename.zip"
mv android-ndk-r26d/* $ANDROID_NDK_ROOT


echo "Installation complete."
