package com.scalaAsm.x86
package Instructions
package General

// Description: Move with Sign-Extension
// Category: general/conver

trait MOVSXD extends InstructionDefinition {
  val mnemonic = "MOVSXD"
}

object MOVSXD extends TwoOperands[MOVSXD] with MOVSXDImpl

trait MOVSXDLow extends MOVSXD {
  implicit object _0 extends TwoOp[r64, rm32] {
    val opcode: OneOpcode = 0x63 /r
    val format = RegRmFormat
  }
}

trait MOVSXDImpl extends MOVSXDLow {
  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: OneOpcode = 0x63 /r
    val format = RegRmFormat
  }
}
