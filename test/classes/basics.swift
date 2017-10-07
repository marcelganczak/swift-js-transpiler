struct Resolution {
    var width = 0
    var height = 0
}
class VideoMode {
    var resolution = Resolution()
    var frameRate = 0
    var name: String?
    func increaseFrameRate() {
        frameRate += 1
    }
    func increaseFrameRateBy(amount: Int) {
        self.frameRate += amount
    }
}
let someResolution = Resolution()
let someVideoMode = VideoMode()
print("The width of someResolution is \(someResolution.width)")
print("The width of someVideoMode is \(someVideoMode.resolution.width)")
someVideoMode.resolution.width = 1280
print("The width of someVideoMode is now \(someVideoMode.resolution.width)")
someVideoMode.increaseFrameRate()
print("The frame rate of someVideoMode is now \(someVideoMode.frameRate)")
someVideoMode.increaseFrameRateBy(amount: 2)
print("The frame rate of someVideoMode is now \(someVideoMode.frameRate)")