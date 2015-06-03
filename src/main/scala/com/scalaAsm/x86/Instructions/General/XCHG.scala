package com.scalaAsm.x86
package Instructions
package General

// Description: Exchange Register/Memory with Register
// Category: general/datamov

trait XCHG extends InstructionDefinition {
  val mnemonic = "XCHG"
}

object XCHG extends OneOperand[XCHG] with TwoOperands[XCHG] with XCHGImpl

trait XCHGLow extends XCHG {
  implicit object _0 extends TwoOp[r8, rm8] {
    val opcode: OneOpcode = 0x86 /r
    val format = RegRmFormat
  }
}

trait XCHGImpl extends XCHGLow {
  implicit object _1 extends TwoOp[r16, rm16] {
    val opcode: OneOpcode = 0x87 /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r32, rm32] {
    val opcode: OneOpcode = 0x87 /r
    val format = RegRmFormat
  }

  implicit object _3 extends TwoOp[r64, rm64] {
    val opcode: OneOpcode = 0x87 /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }

  implicit object _4 extends OneOp[r16] {
    val opcode: OneOpcode = 0x90 + rw
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _5 extends OneOp[r32] {
    val opcode: OneOpcode = 0x90 + rd
    val format = RegFormat
    override def hasImplicitOperand = true
  }

  implicit object _6 extends OneOp[r64] {
    val opcode: OneOpcode = 0x90 + ro
    override def prefix = REX.W(true)
    val format = RegFormat
    override def hasImplicitOperand = true
  }
}
