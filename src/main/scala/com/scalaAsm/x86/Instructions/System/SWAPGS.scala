package com.scalaAsm.x86
package Instructions
package System

// Description: Swap GS Base Register
// Category: general

trait SWAPGS extends InstructionDefinition {
  val mnemonic = "SWAPGS"
}

object SWAPGS extends ZeroOperands[SWAPGS] with SWAPGSImpl

trait SWAPGSImpl extends SWAPGS {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
        override def hasImplicitOperand = true
  }
}
